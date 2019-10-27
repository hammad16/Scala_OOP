
///////////////////////////////////////////////
//Basic Program in Scala
///////////////////////////////////////////////
//Multiplication
///////////////////////////////////////////////
//Implementar autostring (case)
///////////////////////////////////////////////

//Se usa solamente cuando un objeto almacena informacion
case class Racional(Num:Double,Den:Double) {
	// Aquí se comprueba el denominador para instaciar
	require(Den !=0)

///////////////////////////////////////////////
	
 // Funciones para definir las operaciones del numerador y denominador
	def this(numerator:Double)={
		this(numerator,1)
	}

	// Metodo para representar el valor racional desde el punto de vista decimal 
	def toDecimal():Double = this.Num/this.Den

	// Metodo para multiplicar dos racionales
	def multiplica(rad:Racional):Racional = {
		val numer:Double = this.Num * rad.Num
		val denom:Double = this.Den * rad.Den
		return new Racional(numer,denom)	
	}
}
 //

///////////////////////////////////////////////

// main
object oPrincipal {
	def main(args:Array[String])={

		// Definiendo los valores para multiplicar
		val r1: Racional = new Racional(2,3)
		println(r1)
		val r2: Racional = new Racional(4)
		println(r2)

		// Operacion
		val r3: Racional = r1 multiplica r2 

		// Imprimir los resulados

		println("The multiplication is: "+ r3)
		println("The decimal value is "+ r3.toDecimal())
	}
}
