fun main(args: Array<String>) {
    // 1- 인사말 출력
    // 2 사용자 이름 입력 받기
    // 3 입력받은 사용자 이름 출력
    println("Hello, Welcome to ShopMall")
    println("Please type your name to continue shopping")

    val name = readLine()
    println("""
        Thank you. Welcome $name
        Input category you want.
        ***=====================***
        """.trimIndent())
}