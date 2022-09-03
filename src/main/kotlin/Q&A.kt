fun main() {
    print("Q1-How many days are there in a week: ")
    val t1 = "7";
    val t2 = "365";
    val t3 = "24";
    val t4 = "7";
    val t5 = "Camels";

    val enteredString1 = readLine()
    println("'You have entered this: $enteredString1' + t1")

    print("Q2-How many days are there in a year: ")

    val enteredString2 = readLine()
    println("'You have entered this: $enteredString2' + t2")

    print("Q3-How many hours are there in a day: ")

    val enteredString3 = readLine()
    println("'You have entered this: $enteredString3'  + t3")

    print("Q4-Rainbow consist of how many colors: ")

    val enteredString4 = readLine()
    println("'You have entered this: $enteredString4' + t4")

    print("Q5-Which animal is known as the 'Ship of the Desert': ")

    val enteredString5 = readLine()
    println("'You have entered this: $enteredString5' + t5")


    //comparing strings
    println("enteredString1 and t1 match? : " + enteredString1.equals(t1, ignoreCase = true));
    println("enteredString2 and t2 match? : " + enteredString2.equals(t2, ignoreCase = true));
    println("enteredString3 and t3 match? : " + enteredString3.equals(t3, ignoreCase = true));
    println("enteredString4 and t4 match? : " + enteredString4.equals(t4, ignoreCase = true));
    println("enteredString5 and t5 match? : " + enteredString5.equals(t5, ignoreCase = true));


    if (enteredString1 != t1) {
        print("You got the wrong answer!")
    } else {
        print("You guessed it right!")
    }

}



