package org.java8.chap8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 滕广银
 * @description TODO
 * @date 2023/10/11 10:52
 */
public class ObserverMain {
    interface Observer {
        void inform(String tweet);
    }

    interface Subject {
        void registerObserver(Observer o);

        void notifyObserver(String tweet);
    }

    private static class NYTimes implements Observer {

        @Override
        public void inform(String tweet) {
            if (tweet != null && tweet.contains("money")) {
                System.out.println("Breaking news in NY!" + tweet);
            }

        }
    }

    private static class Guardian implements Observer {
        @Override
        public void inform(String tweet) {
            if (tweet != null && tweet.contains("queen")) {
                System.out.println("Yet another news in London..." + tweet);
            }
        }
    }

    private static class LeMonde implements Observer {

        @Override
        public void inform(String tweet) {
            if (tweet != null && tweet.contains("wine")) {
                System.out.println("Today cheese, wine and news! " + tweet);
            }
        }
    }

    private static class Feed implements Subject {

        private final List<Observer> observers = new ArrayList<>();

        @Override
        public void registerObserver(Observer o) {
            this.observers.add(o);
        }

        @Override
        public void notifyObserver(String tweet) {
            observers.forEach(o -> o.inform(tweet));
        }
    }

    public static void main(String[] args) {
        Feed f = new Feed();
        f.registerObserver(new NYTimes());
        f.registerObserver(new Guardian());
        f.registerObserver(new LeMonde());

        f.notifyObserver("The queen said her favourite book is Java 8 in Action!");

        Feed feedLambda = new Feed();
        feedLambda.registerObserver((String tweet) -> {
            if (tweet != null && tweet.contains("money")) {
                System.out.println("Breaking news in NY!" + tweet);
            }
        });

        feedLambda.registerObserver((String tweet) -> {
            if (tweet != null && tweet.contains("queen")) {
                System.out.println();
            }
        });

        feedLambda.notifyObserver("Money money money, give me money!");

    }
}
