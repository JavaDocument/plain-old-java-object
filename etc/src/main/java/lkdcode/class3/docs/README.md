# ☕ class 3

<br>
<br>

#### 🎯 Study

단순히 숫자를 입력받는 것은 한계가 있다고 생각하여 범위 내의 난수를 생성해 로직을 구현하였다.<br>
책을 기준으로 시작 면과 마지막 면을 정의했다.<br>
내 앞에 책이 있고 앞면의 겉 표지를 넘긴다면 시작 면이라고 간주했다.<br>
내 앞에 책이 있고 뒷면의 겉 표지를 넘긴다면 마지막 면이라고 간주했다.<br>
시작 면 or 마지막 면은 무조건 1,2 or 399,400 번호가 나오기 때문에<br>
해당 범위는 난수 생성에서 제외하였다.<br>
즉, 3~398 페이지까지 난수 생성 범위를 제한하였다.<br>

- [x] 임의로 펼친다는 것은 난수 생성과 같다고 판단<br>
- [x] 각 자리 숫자를 모두 더하거나, 곱하여 가장 큰 수를 구한다.<br>
- [x] 점수를 비교해 게임의 승자를 결정한다.<br>
- [x] 시작 면이나 마지막 면이 나오도록 책을 펼치지 않는다.<br>
  <br>
- [x] 범위의 값은 3 이상 398 이하이다.
- [x] 플레이어는 2명이다. (Pobi, Crong)
    - [x] 잘못 된 플레이어는 익셉션을 던진다.

<br>
<br>

#### 🤔 체크리스트

- [x] 이전 스터디 내용을 생각했는가, 적용했는가?
    - [x] 문자열 가공 (최대값 구하는 메서드)
    - [x] 디미터의 법칙 & TDA
    - [x] 역할에 의존하라
    - [x] 명확한 표현
- [x] 모든 변수들을 통제하였는가?
    - [x] 난수의 범위를 테스트 코드로 통제하였다.
    - [x] 최대값을 구하는 메서드 역시 테스트 코드로 통제하였다.
- [x] 컨벤션을 잘 지켰는가?
    - [x] 객체지향 생활 체조 총정리 참고
- [x] 내가 짠 코드에 어느 부분이 객체지향적인가?
  > Player : 책을 여는 행동을 통해 최댓값을 알기만 하면 된다.<br>
  어떻게 최댓값을 구하는지 관심사가 아니다.<br>

  > Book : 플레이어에게 최댓값을 알려주어야 하는 책임.<br>
  Player의 메시지에 대한 응답으로 최댓값을 알려주어야 하는데 몇 페이지가 나오는지 관심사가 아니다.<br>
  단순히 열린 페이지에서 왼쪽이든, 오른쪽이든 큰 값을 플레이어에게 알려주기만 하면 된다.<br>

  > Page : 해당 페이지의 최댓값을 계산하는 책임.<br>
  난수로 결정되는 페이지 번호로 최댓값을 구하여 Book에게 알려주어야 한다.<br>
  객체 스스로 값을 계산하여 알려주게 된다.<br>

- [x] 명확한 표현을 했는가?
    - [x] 의도를 나타내기 위해 모든 수단과 방법을 가리지 않았다.
- [x] 가독성이 좋은가?
    - [x] 자동 정렬을 통해 기준을 통일하였다.
    - [x] 하나의 메서드는 하나의 일만 수행하도록 하였다.
- [x] 중복을 제거했는가?
    - [x] 중복 사용되는 코드는 상위 클래스에서 나누어 쓸 수 있게 구현하였다.

<br>
<br>

---

## 🚀 기능 요구 사항

포비와 크롱이 페이지 번호가 1부터 시작되는 400 페이지의 책을 주웠다. 책을 살펴보니 왼쪽 페이지는 홀수, 오른쪽 페이지는 짝수 번호이고 모든 페이지에는 번호가 적혀있었다. 책이 마음에 든 포비와 크롱은 페이지
번호 게임을 통해 게임에서 이긴 사람이 책을 갖기로 한다. 페이지 번호 게임의 규칙은 아래와 같다.

1. 책을 임의로 펼친다.
2. 왼쪽 페이지 번호의 각 자리 숫자를 모두 더하거나, 모두 곱해 가장 큰 수를 구한다.
3. 오른쪽 페이지 번호의 각 자리 숫자를 모두 더하거나, 모두 곱해 가장 큰 수를 구한다.
4. 2~3 과정에서 가장 큰 수를 본인의 점수로 한다.
5. 점수를 비교해 가장 높은 사람이 게임의 승자가 된다.
6. 시작 면이나 마지막 면이 나오도록 책을 펼치지 않는다.

포비와 크롱이 펼친 페이지가 들어있는 리스트/배열 pobi와 crong이 주어질 때, 포비가 이긴다면 1, 크롱이 이긴다면 2, 무승부는 0, 예외사항은 -1로 return 하도록 solution 메서드를 완성하라.

### 제한사항

- pobi와 crong의 길이는 2이다.
- pobi와 crong에는 [왼쪽 페이지 번호, 오른쪽 페이지 번호]가 순서대로 들어있다.

### 실행 결과 예시

| pobi       | crong      | result |
|------------|------------|--------|
| [97, 98]   | [197, 198] | 0      |
| [131, 132] | [211, 212] | 1      |
| [99, 102]  | [211, 212] | -1     |
| [123, 124] | [95, 96]   | ?      |
| [401, 402] | [1, 2]     | ?      |
| [12, 13]   | [21, 31]   | ?      |
| [373, 374] | [235, 236] | ?      |
| [98, 97]   | [123, 124] | ?      |
| [1, 2]     | [399, 400] | ?      |
| [273, 274] | [372, 373] | ?      |

<br>
<br>

---

<br>
<br>

### 📚 Study History

---

[23.07.15](https://github.com/JavaDocument/Class1/blob/main/docs/230715.md)
<br>
[23.07.21](https://github.com/JavaDocument/Class1/blob/main/docs/230721.md)
