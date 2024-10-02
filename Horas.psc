Algoritmo Horas
	Escribir 'Dime una hora"
	Leer h1
	Escribir "dime minutos"
	Leer m1
	Escribir "dime segundos"
	Leer s1
	Escribir 'Dime otra hora"
	Leer h2
	Escribir "dime minutos"
	Leer m2
	Escribir "dime segundos"
	Leer s2
	t1 = h1 * 3600 + m1 * 60 + s1
	t2 = h2 * 3600 + m2 * 60 + s2
	Si t1 > t2 Entonces
		Escribir "la primera hora es mayor"
	SiNo
		Si t1 == t2 Entonces
			Escribir "son la misma hora"
		SiNo
			Escribir "la segunda hora es mayor"
		FinSi
	FinSi
FinAlgoritmo
