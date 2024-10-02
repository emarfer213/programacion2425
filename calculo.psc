Algoritmo calculo
	Escribir ' elije un caracter que sea +, -, *, /, %'
	Leer c1
	Escribir ' dame dos numeros '
	Leer n1
	Leer n2
	Según c1 Hacer
		'+':
			Escribir n1, ' sumado a ', n2, ' es ', n1+n2
		'-':
			Escribir n1, ' restado a ', n2, ' es ', n1-n2
		'*':
			Escribir n1, ' por ', n2, ' es ', n1*n2
		'/':
			Si n2 == 0 Entonces
				Escribir "error"
			SiNo
				Escribir n1, ' entre ', n2, ' es ', n1/n2
			FinSi
		'%':
			Escribir 'el ', n2, ' por ciento de ', n1, ' es ', (n1*n2)/100
		De Otro Modo:
			Escribir 'error'
	FinSegún
FinAlgoritmo
