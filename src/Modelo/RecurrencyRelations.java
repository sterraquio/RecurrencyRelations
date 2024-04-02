
package Modelo;


public class RecurrencyRelations {

    //Atributes
    private int numberList[]= {2,0,0,0,0,0};
    private int secondList[]={0, 1, 0, 0, 0, 0};
    private int thirdList[]={2,0,0,0,0,0};
    private int fourthList[]={0,0,0,0,0,0};
    
    //Constructor
    public RecurrencyRelations() {
    }

    //Methods
    public int firts(int choose){

        

        int tamanhoLista = numberList.length;
        for (int i = 1; i < tamanhoLista; i++) {
            numberList[i]= 3* numberList[i-1] + i;
        }

        return numberList[choose];
    }

    public int second (int choose2){
        
        for (int i = 2; i < secondList.length; i++) {
            secondList[i]=(i*i)*secondList[i-1]-3;
        }
        return secondList[choose2];
    }

    public int third (int choose3){

        for (int i = 1; i < thirdList.length; i++) {
            thirdList[i]=-2*(thirdList[i-1])+3;
        }
        return thirdList[choose3];
    }

    public int fourth (int choose4){

        for (int i = 2; i < fourthList.length; i++) {
            fourthList[i]=-2 * fourthList[i-1] + (int)Math.pow(2,i);
        }
        return fourthList[choose4];
    }


    //Getters and setters
    public int[] getNumberList() {
        return numberList;
    }

    public void setNumberList(int[] numberList) {
        this.numberList = numberList;
    }

    public int[] getSecondList() {
        return secondList;
    }

    public void setSecondList(int[] secondList) {
        this.secondList = secondList;
    }

    public int[] getThirdList() {
        return thirdList;
    }

    public void setThirdList(int[] thirdList) {
        this.thirdList = thirdList;
    }

    public int[] getFourthList() {
        return fourthList;
    }

    public void setFourthList(int[] fourthList) {
        this.fourthList = fourthList;
    }


    
    
}
