package observers;

public class ObserverImpl2 implements Observer {
    double lastState;
    @Override
    public void update(int etat) {
      if(etat-lastState>0){
          System.out.println("Observateur 2 " + lastState);
      }
      else{
          System.out.println("Observateur 2: stabilite" );
      }
    }
}
