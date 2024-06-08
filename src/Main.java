import observables.Observable;
import observables.ObservableImpl;
import observers.Observer;
import observers.ObserverImpl1;
import observers.ObserverImpl2;

public class Main {
    public static void main(String[] args) {
        ObservableImpl observable =  new ObservableImpl();

        Observer observer1 = new ObserverImpl1();
        Observer observer2 =  new ObserverImpl2();

        //abonnement
        observable.subscribe(observer1);
        observable.subscribe(observer2);

        observable.setEtat(90);
        System.out.println("==============");
        observable.setEtat(50);

        //unsubscribe
        System.out.println("==============");
        observable.unsubscribe(observer1);
    }
}