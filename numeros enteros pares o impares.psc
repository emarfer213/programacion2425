Algoritmo entero
	Repetir
		Escribir ' dame la cantidad de numeros que vas a meter'
		Leer c1
	Hasta Que c1>0
	Para i<-1 Hasta c1 Con Paso 1 Hacer
		Repetir
			Escribir 'dame un numero'
			Leer n1
		Hasta Que n1>0
		Si n1 MOD 2==0 Entonces
			Escribir n1, ' es un numero par'
		SiNo
			Escribir n1, ' es un numero impar'
		FinSi
	FinPara
FinAlgoritmo
