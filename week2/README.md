# Week 2 계산기 구현
## 목차
+ [프로젝트 소개](#프로젝트-소개)
+ [프로젝트 기간](#프로젝트-기간)
+ [기능 소개](#기능-소개)
+ [기술 스택](#기술-스택)
+ [결과 화면](#결과-화면)
+ [동작 방식](#동작-방식)
---
## 프로젝트 소개
Kotlin 문법 학습 후 적용해보는 프로젝트 
## 프로젝트 기간
2024.04.22 ~ 2024.04.26 (5일)
## 기능 소개
| 구분 | 기능 |      설명       |
|:--:| :-: |:-------------:|
| 연산 |덧셈| 입력받은 수를 더한다.  |  
| 연산 |뺄셈|  입력받은 수를 뺀다.  |  
| 연산 |곱셈| 입력받은 수를 곱한다.  |
| 연산 |나눗셈| 입력받은 수를 나눈다. |
## 기술 스택
### 사용언어  
   + <img src="https://img.shields.io/badge/kotlin-%237F52FF.svg?style=for-the-badge&logo=kotlin&logoColor=white"/>  
### Tool, 버전관리 
   + <img src="https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white"/>  
   + <img src="https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white"/>
---  
## 결과 화면
![image](https://github.com/hellou8363/kotlin-individual-assignment/assets/89592727/f3561d4f-d615-458d-84b8-f1ad363b49bc)

## 동작 방식
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
