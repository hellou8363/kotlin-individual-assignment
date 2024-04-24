# Week 2 계산기 구현하기
## 결과화면
![image](https://github.com/hellou8363/kotlin-individual-assignment/assets/89592727/f3561d4f-d615-458d-84b8-f1ad363b49bc)

## 동작방식
1. Guidance 클래스의 usageGuide 함수가 계산기 사용에 대한 안내를 출력하고 키보드 입력을 받는다.
2. 입력 받은 값을 Storage 클래스의 save 함수에 전달한다.
3. save 함수는 입력 받은 값이 다음에 해당할 때 Guidance 클래스의 errorGuide 함수에게 전달한다.  
   - 사칙연산 기호와 숫자 외 다른 값이 있는 경우
   - 계산할 수 있는 범위의 값을 넘어서는 경우
4. 입력 값에 문제가 없는 경우, 기호와 숫자를 분리하여 List에 저장한다.
5. 기호를 저장한 List를 기준으로 숫자를 저장한 List에서 값을 하나씩 가져와 기호에 맞는 연산 함수에게 전달한다.
6. 값을 전달받은 연산 함수(xxxOperation)는 두 개의 값을 연산 후 결괏값을 반환한다.
7. 반환된 값은 Storage 클래스의 결괏값을 저장하는 변수(result)에 저장하고 다음 진행을 위해 Calculator의 next 함수를 호출한다.
8. 5 ~ 8번의 순서를 반복하면서 입력 받은 값을 모두 더했을 경우 Guidance 클래스의 resultGuide 함수에 결괏값을 저장한다.
9. resultGuide 함수는 전달받은 결괏값을 출력한다.
10. 프로그램이 종료된다.
