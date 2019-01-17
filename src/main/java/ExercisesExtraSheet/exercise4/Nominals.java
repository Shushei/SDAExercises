package ExercisesExtraSheet.exercise4;

public enum Nominals {A(200), B(100),C(50),D(20),E(10),F(5),G(2),H(1);
    private int numVal;

    Nominals(int numVal){
        this.numVal = numVal;
    }
    public int getNumVal(){
        return numVal;
    }
}
