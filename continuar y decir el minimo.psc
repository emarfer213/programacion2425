Algoritmo continuar
	i = 9999999999999
	Repetir
		Escribir "introduce un numero"
		Leer n1
		Si n1 <= i Entonces
			i = n1
		FinSi
		Escribir "quieres continuar? si (S) o no (N)"
		Leer n2
	Hasta Que n2 == "N"
	Escribir " el numero mas bajo es " i
FinAlgoritmo
