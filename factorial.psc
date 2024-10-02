Algoritmo factorial
	Repetir
		Escribir "dame un numero, solo cero o numeros enteros"
		Leer n
		x = 1
	Hasta Que n>=0
	Para i<-n Hasta 1 Con Paso -1 Hacer
		x = i*x
	FinPara
	Escribir " el factorial es " x
FinAlgoritmo
