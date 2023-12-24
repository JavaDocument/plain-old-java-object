# 포비와 크롱이 페이지 번호 대결

## v1 - 기능별 구현
- 객체지향 고려 X
### `int randomPage()`
- 책(1~400페이지)중 임의로 홀수 페이지를 리턴하는 메서드
### `List<Integer> digitExtraction(int page)`
-  각 자리 수를 추출해서 리스트에 담아 리스트로 반환하는 메서드
### `int digitSum(List<Integer> digitList)` 
- 리스트의 값을 모두 더해서 반환하는 메서드
### ` int digitMultiple(List<Integer> digitList)`
- 리스트의 값을 모두 곱해서 반환하는 메서드
### `int maxNumber(int sumResult, int multiResult)`
- 두 수 중 큰 값을 반환하는 메서드
### `int finalScore(int meScore, int opponentScore)`
- 최종 점수 두 수를 받아 결과를 반환하는 메서드
### ` void userInfo(User user)`
- 유저 정보를 출력하는 메서드
### `void gap()`
- 공백을 출력하는 메서드
### `void solution()`
- 전반적인 비즈니스 로직을 실행하는 메서드



