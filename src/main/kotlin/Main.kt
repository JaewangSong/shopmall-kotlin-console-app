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

    /*
    *
     */

    val categories = arrayOf("fashion", "tech", "pets")
    for (category in categories) {
        println(category)
    }
    
    println("==> 장바구니로 이동하시려면 '#'을 입력하세요")
    //
    var selectedCategory = readLine()
    
    // 사용자 입력을 반복처리
    // 사용자가  올바른 입력할 때까지 반복처리
    while (selectedCategory.isNullOrBlank()) {
        println("값을 입력하세요")
        selectedCategory = readLine()
    }
    
    if (selectedCategory == "#") {
        // TODO 1 자바구니로 
    } else {
        // TODO 2 카테고리 상품 목록 보여주기
        // TODO 3 카테고리 목록에 업슨ㄴ 경우 처리
    } 
}