# 미션 - 자동차 경주 게임

## Flow
1. 자동차 입력 요구하기
2. 자동차 이름, 개수 입력받기 
3. 자동차 정보 저장하기
4. 시도횟수 입력 요구하기
5. 횟수 입력받기
6. 시도 횟수 예외 상황 시 에러 발생시키기.
7. 게임 진행 위해 게임 상황판 만들기
8. 게임 진행시키기
> 8-1. Go/Stop 실행   
8-2. 위치 저장   
8-3. 현상황 출력
9. 회수 도달 시 게임 종료하기
10. 우승자 계산하기
11. 우승자 출력하기



## 필요한 기능

### 자동차
속성: 자동차의 이름, 자동차의 처음 위치
- 입력된 자동차의 이름을 저장하고 각 처음 경주 시작 위치를 저장한다.
- 자동차의 이름과 처음 위치를 받아올 수 있도록 한다.

### 게임기
속성: 게임 진행 여부, 우승자
- 게임을 시작시킨다.(게임 상황판 실행)
- 게임이 끝나면 우승자를 판단하여 결정한다.

### 게임진행
속성: 게임이 진행된 회수
- 해당 게임에 참가하는 자동차의 이름과 현재위치를 게임의 상황판에 저장한다.
- 전진 여부 판단을 통해 각 자동차의 현재 위치를 업데이트한다.
- 게임이 진행된 횟수를 판단하여 종료 횟수에 도달하면 게임을 종료한다.

### 게임 자동차 상황판
속성: 게임 참가 자동차 이름, 자동차 현재 위치

### 전진 여부 판단
- 이동 전 위치를 받아서 자동차들에 대해 Go/Stop을 계산하고 이동 후 위치를 반환한다.

### 입력
- 자동차 입력받기
- 횟수 입력받기

### 출력
- 입력 메세지 출력하기
- 현재 참가 자동차들의 위치 출력하기
- 우승자 출력하기
- 예외 메세지 출력하기

### 예외 확인
- 시도 횟수 입력이 숫자가 아니면 예외 메세지 발생시키기