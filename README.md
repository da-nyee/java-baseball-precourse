# 미션 - 숫자 야구 게임
우아한테크코스 웹 백엔드 프리코스 1주차 미션 프로젝트입니다.

## 👩‍💻 구현할 기능 목록
### 프로그램
- [x] 1에서 9까지 서로 다른 임의의 수 3개를 정한다.

### 플레이어
- [x] 3자리 수를 입력한다.
    - [x] 비정상적인 입력에 대해서는 `IllegalArgumentException`을 발생시킨다.
        - 3자리보다 짧은 길이의 숫자 또는 긴 길이의 숫자가 입력되는 경우 (ex. 12, 3216)
        - 문자 또는 0이 입력되는 경우 (ex. 2a6, 206)
        - 동일한 숫자가 입력되는 경우 (ex. 115) 

### 힌트
- [x] 같은 자리에 같은 숫자가 있는 경우 `스트라이크`로 정한다.
- [x] 다른 자리에 같은 숫자가 있는 경우 `볼`로 정한다.
- [x] 같은 숫자가 하나도 없는 경우 `낫싱`을 받는다.

### 게임 종료
- [x] 프로그램의 3자리 숫자와 플레이어의 3자리 숫자가 같은 경우 게임이 종료된다.
    - [x] 게임을 재시작하려면 `1`을 입력한다.
    - [x] 게임을 완전히 종료하려면 `2`를 입력한다.
    - [x] 비정상적인 입력에 대해서는 `IllegalArgumentException`을 발생시킨다.
        - 1, 2 외의 다른 숫자가 입력되는 경우
        - 문자가 입력되는 경우

<br>

## ✅ 확인할 프로그래밍 목록
### 요구사항
- [x] 자바 코드 컨벤션을 지키면서 프로그래밍한다.
- [x] (1 <= indent depth) && (indent depth <= 2) 이다.
- [x] 3항 연산자를 쓰지 않는다.
- [x] 함수가 한 가지 일만 하도록 최대한 작게 만든다.
- [x] System.exit 메소드를 사용하지 않는다.
- [x] 비정상적 입력에 대해서 예외(IllegalArgumentException)을 발생시킨다.

### 추가사항
- [x] 코드 리팩토링을 진행한다.
- [x] 주석을 Javadoc 형태로 변경한다.

<br>

## 📚 고려할 리팩토링 목록
- [ ] MVC 패턴을 적용한다.
- [ ] 일급 컬렉션을 사용한다.
- [ ] 1주차, 2주차 피드백을 생각한다.

## 📝 License

This project is [MIT](https://github.com/woowacourse/java-baseball-precourse/blob/master/LICENSE) licensed.
