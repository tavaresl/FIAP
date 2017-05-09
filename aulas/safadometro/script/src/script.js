'use strict'

function calcular() {
	var _form = document.querySelector('#form')
	var _dia  = parseInt(_form.dia.value)
	var _mes  = parseInt(_form.mes.value)
	var _ano  = parseInt(_form.ano.value)
	
	var _soma  = 0
	var safado = 0
	var anjo   = 0

	for (var i = 1; i <= _mes; i++) {
		_soma += i
	}
	
	safado = _soma + (_ano/100) * (50 - _dia)
	anjo   = 100 - safado

	printResultado(safado, anjo)
}

function printResultado(safado, anjo) {
	var resultArea = document.querySelector('#area-resultado')
	var anjoArea   = resultArea.querySelector('#anjo')
	var safadoArea = resultArea.querySelector('#safado')

	anjoArea.innerText 	 = anjo
	safadoArea.innerText = safado

	resultArea.classList.remove('hidden')
}