package data

class Car(paramBrand : String, paramYear: Int = 2000) {
   init {
       println("car : $paramBrand dibuat")
   }
    var brand : String = paramBrand
    var year: Int = paramYear
}