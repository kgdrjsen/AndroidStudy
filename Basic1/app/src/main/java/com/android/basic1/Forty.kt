package com.android.basic1

//31번 문제
//[31][유정목] 배열안의 정수가 오름차순이면 true 아니면 false를 반환 (입력[1,2,3 ] 출력[true])
//패스


//32번 문제
//[유정목] 입력한 숫자의 인수를 구하세요 (입력:20 출력: 1,2,4,5,10,20)
//패스


//33번 문제
//[33][유정목] 입력한 수만큼의 정사각형을 '*'을 이용해서 만드세요 (입력: 4 출력:4x4)
//패스


//34번 문제
//[34][정민수] 계이름  "도" "레" "미" "파" "솔" "라" "시" 가 있다. InputNumber를 입력했을 때 (1 - 도, 2 -레, 3- 미, 4 -파 ,5- 솔, 6 -라, 7 - 시) 로 출력하게 하시오. 1~7 이외 의 숫자가 입력 되면 " " 을 출력하게 하시오.  (입력 : 1234, 출력:도레미파) , (입력 : 1239, 출력 : 도레미)
//패스


//35번 문제
//[35][정민수] 2024년도는 용띠의 해이다. 2012년도, 2000년도 처럼 용띠의 해를 입력하면 "용띠의 해입니다.", 아니면 "false"를 출력하시오. 입력 : 1988 출력 : "1988년도는 용띠의 해입니다" / 입력 : 2001 출력 : "false"
//패스


//36번 문제
//[36][정민수] 1~ 100까지의 숫자중 짝수이면 +1 을 하고 홀수면 -2를 하여 그 값을 모두 더한 값을 출력하시오. ex) i +1 , i -2 ,,,, 32+1 +33 -2…
//fun main() {
//    var answer = 0
//    for (i in 1..100) {
//        if(i % 2 == 0) {
//            answer += 1}
//            else {
//                answer -= 2
//            }
//    }
//    println(answer)
//}


//37번 문제
//[37][최성현] OX를 번갈아가면서 출력해보세요.(조건: 첫번째줄 O부터시작, 두번째줄은 X부터 시작, 세번째줄O, ... , 단순출력X, 조건문과 반복문 사용 / 입력:숫자 2개(가로줄개수, 세로줄개수)) \
//패스


//38번 문제
//[38][최성현] 별모양 각줄에 1개,2개,3개,,,n개, n-1개...1개 출력(조건:각각의 줄은 가운데 정렬(다이아몬드모양) / EX) 입력: 5 / 출력↓↓ )
//패스


//39번 문제
//[39][최성현] 100이하의 자연수중 10개의 숫자를 입력해 합이 10이하면 1을 11~30이면 2를 31~50면 3, 그 이상이면 4출력
//fun main() {
//    for (n in 1..100) {
//        val num1 = readLine()!!.toInt()
//        val num2 = readLine()!!.toInt()
//        val num3 = readLine()!!.toInt()
//        val num4 = readLine()!!.toInt()
//        val num5 = readLine()!!.toInt()
//        val num6 = readLine()!!.toInt()
//        val num7 = readLine()!!.toInt()
//        val num8 = readLine()!!.toInt()
//        val num9 = readLine()!!.toInt()
//        val num10 = readLine()!!.toInt()
//        val sum = num1+num2+num3+num4+num5+num6+num7+num8+num9+num10
//
//        if(sum <= 10) {
//            println("1")
//        } else if (sum <=30) {
//            println("2")
//        } else if (sum <=40) {
//            println("3")
//        } else {
//            println("4")
//        }
//    }
//}


//40번 문제
//[40][최영정] 주어진 숫자 배열 오름차순 정렬(선택 정렬 알고리즘 사용) (입력: [3, 2, 8, 5, 20] -> 출력: [2, 3, 5, 8, 20]), sort 사용금지. 리스트, 배열 상관없음.
//패스


//41번 문제
//[41][최영정] 1에서 9까지 한 자리 자연수 입력 시 그 수만큼 반복된 문자열 출력 (입력: 3 -> 출력: 333),
//패스


//42번 문제
//[42][최영정] 문자열로 된 배열[5개]이 주어졌을 때 문자열 안에 특정 문자(입력 받아)가 포함된 문자열만 찾기 (입력: ["abd", "cef", "abcd"] 특정 문자: "b" -> 출력: ["abd", "abcd"]
//패스


//43번 문제
//[43][송동철] 1~100의 숫자중 2의 배수이면서 3의배수(and조건)인 숫자 출력해주세요
//fun main() {
//    for(i in 1..100) {
//        if(i % 2 == 0 && i % 3 == 0) {
//            println("$i")
//        }
//    }
//}


//44번 문제
//[44][송동철] 주민번호를 뒷자리를 입력받아 남자인지 여자인지 구분하는 프로그램을 작성하시오. 첫자리 홀수(1,3): 남자, 짝수(2,4):여자
//fun main() {
//    var str = readLine()!!.toInt()
//    var strM = listOf<Int>(str)
//
//    if (strM[0] == 1 || strM[0] ==3) {
//        println("남자")
//    }else if (strM[0] == 2 || strM[0] == 4){
//        println("여자")
//    }else {
//        println("입력이 올바르지 않습니다.")
//    }
//
//}
//패스


//45번 문제
//[45][송동철] 두개의 주사위를 던지고 합이 8이 나오는 모든 경우의 수 (출력 (2,6), (3,5),(4,4), (5,3), (6,2))
//패스