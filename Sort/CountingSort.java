import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class Main {
    int[] numbers; //입력된 숫자
    int[] countArr;//숫자 세기
    int[] result; //정렬된 후 숫자 저장
    int max = 0;
 
    void inputNumbers() throws IOException {//숫자 입력하기
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            int num = sc.nextInt();
            numbers[i] = num;
            if (max < num) {
                max = num;
            }
        }
    }
 
    int findMaxNumber() {       //최댓값 찾기
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }
 
    void display() {
        for (int i = 0; i < countArr.length; i++) {
            System.out.print(countArr[i] + " ");
        }
        System.out.println();
    }
 
    void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
 
    void sort() throws IOException {
        inputNumbers();
        //int maxNumber = findMaxNumber();     //최댓값 저장
        int maxNumber = max;
        countArr = new int[maxNumber + 1]; //0-maxNumber+1만큼 생성
        result = new int[numbers.length];
 
        for (int i = 0; i < numbers.length; i++) {
            //해당하는 숫자 카운터
            countArr[numbers[i]]++;
        }
        //System.out.println("CountArr[]=");
        //display();
 
        for (int i = 1; i < countArr.length; i++) {
            //누적 숫자 더하기
            countArr[i] += countArr[i - 1];
        }
        //System.out.println("누적 배열");
        //display();
 
        for (int i = numbers.length - 1; i >= 0; i--) {
            //정렬하기
            result[--countArr[numbers[i]]] = numbers[i];
            //countArr[numbers[i]]--;
        }
        display(result);
    }
 
 
    public static void main(String[] args) throws IOException {
        new Main().sort();
 
 
    }
}
