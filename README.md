## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```

## 좌표 계산기 (선 길이 출력하기)
- 사용자가 점에 대한 좌표 정보를 입력하는 메뉴를 구성한다. 
  - Menu, XCoordinate, YCoordinate, Dot with XCoordinate and YCoordinate

- 좌표 정보는 괄호"(", ")"로 둘러쌓여 있으며 쉼표(,)로 x값과 y값을 구분한다
  - [x] Dot 을 검증할 때 활용할 수 있는 정보 DotValidator.class
  - [x] 전체적인 구조로 (숫자,숫자) 구조를 만족해야 한다 isMatchedRegex()
    - 정규표현식을 활용 : '('로 시작하고 숫자, ',', 숫자가 존재해야 하며 ')'로 마무리해야 한다
      - [x] 괄호로 둘러 쌓여있어야 한다 ~~coveredWithBraces()~~
      - [x] 쉼표로 x, y 값을 구분한다 ~~splitWithComma()~~

- X, Y좌표 모두 최대 24까지만 입력할 수 있다 (0-24)
  - [x] XCoordinate, YCoordinate 검증 시 활용해야 하는 정보 CoordinateValidator.class
  - [x] 0 - 24 범위 내에 존재하는 수여야 한다 isInRange()
  - [] 정상적인 경우에는 해당 좌표에 특수 문자를 표시한다(*) 표기 하는 걸로  (OutputView, displayDot)
    - [] Dot.class 에서 25*25 형태의 배열을 유지합니다 ??
    - [] 해당되는 좌표에 특수 문자를 저장합니다
    - [] 해당 좌표를 출력합니다 
  - [] 범위에서 벗어난다면 에러 문구 출력 - 재입력을 받아야 한다 
    - [x] **예외** 0보다 작거나, 24 보다 큰 수가 입력된 경우 예외를 throw 합니다
    - [] **예외 처리** 에러 문구를 출력하고, 재입력을 받습니다 
  

- 좌표값을 두 개 입력한 경우, 두 점을 있는 직선으로 가정한다. 좌표값과 좌표값 사이는 '-' 문자로 구분한다 Dots.class
  - [x] 좌표 값을 각각 구분합니다
    - [x] 두 개의 좌표를 구할 수 있는 Dots.class를 형성합니다
    - [x] 검증 사항을 확인합니다 LineValidator.class (이름 수정 필요!!)
      - [x] 정규 표현식에 맞는 입력인지를 확인합니다 
      - [x] '-' 로 구분하고 각각의 좌표 객체를 형성합니다 
 
- 직선인 경우는 두 점 사이 거리를 계산해서 출력한다.
  - 각각의 점을 특수문자로 표현한다
  - 두 점 사이의 거리를 계산합니다
  - 두 점 사이의 거리를 출력합니다 

