package com.example.appofweekthree

object Driver { //singleton

    @JvmStatic
    fun main(args: Array<String>) {
        val str:String="hello world"
        //print(str)

        println()

        val emply:Employee?= null //Employee(1,"Siddharth")//this is the way to create object of class in kt

        //3 ways :-

        //1st way
//        if(emply!=null){
//            print(emply.employeeId)
//        }else{
//            print("it is null")
//        }
        // --> another way
        emply?.let{
            print(emply.employeeId)  //only print the null(empty space) part whenever null is detected
        }

        println()

        //2nd way
        //print(emply?.employeeId)  //? if not null then only print or else if it is null then show null

        println()

        //3rd way
        //emply!!.employeeId //this(!!) means that it guarantee u it will be never null, it will force to access something which is not there(i.e.,null)
    }

}