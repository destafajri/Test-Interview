Feature: Palindrome Check

	Scenario Outline: Palindrome Test
		Given input a word <input>
		When check the palindrome
		Then check result <output>
	
	Examples:
	| input 		| output	|
	|		""			| "Palindrome"		|
	|		"bebeb"	|	"Palindrome"		|
	|		"Kodok"	| "Palindrome"		|
	|	"kodcok"	| "Not Palindrome"|
	| "kod"			|	"Not Palindrome"|