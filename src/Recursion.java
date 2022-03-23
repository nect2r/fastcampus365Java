import java.util.ArrayList;

public class Recursion {
    public int factorialFunc(int n) {
        if(n > 1) {
            return n * this.factorialFunc(n - 1);
        } else {
            return 1;
        }
    }

    public int factorialFunc2(int n) {
        if(n <= 1) {
            return 1;
        }
        return n * this.factorialFunc2(n - 1);
    }

    public int factorialFunc3(ArrayList<Integer> dataList) {
        if (dataList.size() <= 0) {
            return 0;
        }
        return dataList.get(0) + factorialFunc3(new ArrayList<Integer>(dataList.subList(1, dataList.size())));
    }

    public int factorialFunc4(int data) {
        if (data == 1) {
            return 1;
        } else if (data == 2) {
            return 2;
        } else if (data == 3){
            return 4;
        }
        return this.factorialFunc4(data - 1) + this.factorialFunc4(data - 2) + this.factorialFunc4(data - 3);
    }
}
