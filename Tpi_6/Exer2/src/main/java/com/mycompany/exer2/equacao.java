package com.mycompany.exer2;

public class equacao {
    int A, B, C; 
    double b1, delta, R1, R2;
        public void SetEquacao(int Valor1, int Valor2, int Valor3){
            A = Valor1;
            B = Valor2;
            C = Valor3;
        }
            public double GetDelta(){
            b1 = 0;
            b1 = Math.pow(B, 2);
            delta = (b1 - (4*A*C));
            return delta;
            }
            public double GetR1(){
            delta = Math.sqrt(2);
            R1 = (-B+ (delta)) / (2*A);
            return R1;
            }
            public double GetR2(){
            delta = Math.sqrt(2);
            R2 = (-B- (delta)) / (2*A);
            return R2;
            }
                
            equacao(){
                A = 0;
                B = 0;
                C = 0;
                delta = 0;
                R1 = 0;
                R2 = 0;
            }
}
