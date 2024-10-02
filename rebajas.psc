Algoritmo rebajas
	Escribir 'dime tipo de producto'
	Leer t1
	Escribir 'dime precio del producto'
	Leer p1
	Según t1 Hacer
		'A' o "a":
			Escribir ' el resultado es  ', p1 - (p1*0.07)
		"B" o "b":
			Si p1 < 500 Entonces
				Escribir " el precio es " p1 - (p1 * 0.12)
			SiNo
				Escribir " el precio es " p1 - (p1 * 0.09)
			FinSi
		'c' o "C":
			Escribir " el precio es " p1 - (p1 * 0.12)
		De Otro Modo:
			Escribir "error"
	FinSegún
FinAlgoritmo
