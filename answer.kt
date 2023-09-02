fun main(args: Array<String>) {
    var MAX_NUMBER = args[0].toInt()
    MAX_NUMBER = MAX_NUMBER%10
    if(MAX_NUMBER == 0){
        System.exit(0)
    }
    var i = 0
    //iを使って段数分ループ
    while(i < MAX_NUMBER){
        i++
        //空白を出力
        var k = 0
        while(k < MAX_NUMBER-i){
            print(" ")
            k++
        }
        //各段の最大数値までループ
		var j = 0
        while(j < i){
            j++
            print(j)
        }
        //各段の最小数値までループ
        while(j > 1){
            j--
            print(j)
        }
        print("\n")
    }
    
}