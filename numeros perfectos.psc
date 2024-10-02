Algoritmo perfecto
	Repetir
		Escribir 'dame un numero entero y par'
		Leer n1
	Hasta Que n1>0
	Para i<-1 Hasta n1-1 Con Paso 1 Hacer
		Si n1 % i = 0 Entonces
			x = i+x
		FinSi
	FinPara
	Si x == n1 Entonces
		Escribir "es perfercto porque la suma sale " x
	SiNo
		Escribir "no es perfector porque la suma sale " x
	FinSi
FinAlgoritmo
