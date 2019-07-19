
package suma;

/**
 *
 * @author jesica
 */
public class sumas {
    int num1;
    int num2;

public sumas(int num1, int num2){
       this.num1=num1;
       this.num2=num2;

}

public int sumar(){
    return getNum1() + getNum2();
}

public int getNum1(){
    return num1;
}

public int getNum2(){
    return num2;
}
public int setNum1(){
    return num1;
}

public int setNum2(){
    return num2;
}
}
