package com.mycompany.exer1;

public class triangulo {
    float b, a1, area;
        public void SetTriangulo(float Base, float Altura){
            b = Base;
            a1 = Altura;
        }
            public float GetTriangulo(){
                area = (b * a1)/2;
                return area;
            }
        
            triangulo(){
                b = 0;
                a1 = 0;
                area = 0;
            }
}
