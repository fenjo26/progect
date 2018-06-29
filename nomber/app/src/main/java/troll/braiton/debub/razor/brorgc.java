package funt.buyata.hrome.dkfertty;

import java.util.ArrayList;
import java.util.List;

public class brorgc {
    public static void main(String[] args) {
        Tass tass = new Tass();

        tass.subscribe(new Listener() {
            @Override
            public void publish(String message) {
                System.out.println("ШОК!!! " + message);
            }
        });

        tass.subscribe(new Listener() {
            @Override
            public void publish(String message) {
                System.out.println("Ванга это предсказывала! " + message);
            }
        });

        tass.newMessage("Рубль стал дороже доллара");
    }

    public static class Tass {
        private List<Listener> listeners = new ArrayList<>();

        public void subscribe(Listener listener) {
            listeners.add(listener);
        }

        public void unsubscribe(Listener listener) {
            listeners.remove(listener);
        }

        public void newMessage(String message) {
            System.out.println("ТАСС уполномочен сообщить: " + message);

            notifyListeners(message);
        }

        private void notifyListeners(String message) {
            for (Listener listener : listeners) {
                listener.publish(message);
            }
        }
    }

    public interface Listener {
        void publish(String message);
    }
}
