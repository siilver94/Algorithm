# Algoritnm

<br/>

## 알고리즘의 정의

알고리즘이란 어떠한 문제를 해결하기 위한 여러 동작들의 모임이다. <br/>
유한성을 가지며, 언젠가는 끝나야 하는 속성을 가지고 있다. 수학과 컴퓨터 과학에서 알고리즘이란 작동이 일어나게 하는<br/> 내재하는 단계적 집합이다.
알고리즘은 연산, 데이터 진행 또는 자동화된 추론을 수행한다.

<br/>

## 알고리즘의 조건

알고리즘은 다음의 조건을 만족해야 한다.

**입력**  : 외부에서 제공되는 자료가 0개 이상 존재한다.<br/>
**출력** : 적어도 2개 이상의 서로 다른 결과를 내어야 한다.(즉 모든 입력에 하나의 출력이 나오면 안됨)<br/>
**명확성** : 수행 과정은 명확하고 모호하지 않은 명령어로 구성되어야 한다.<br/>
**유한성(종결성)** : 유한 번의 명령어를 수행 후(유한 시간 내)에 종료한다.<br/>
**효율성** : 모든 과정은 명백하게 실행 가능(검증 가능)한 것이어야 한다.<br/>

<br/>

## 연구 분야

**고안** : 완벽한 자동화를 통한 알고리즘의 개발은 거의 불가능하다.<br/>
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;따라서 이미 증명된 유용한 알고리즘들을 습득함으로써 보다 유용한 알고리즘을 개발하는데 그 의미가 있다.<br/>
**검증** : 고안된 알고리즘이 합당한 입력값에 대하여 올바른 결과를 계산해 내는지를 밝히는 절차가 필요하다.<br/>
 &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;알고리즘 검증은 고안된 알고리즘이 프로그래밍 언어와는 독립적으로 올바르게 작동할 수 있음을 보여주는 데 그 목적&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;이 있다.<br/> 
**분석** : 고안된 알고리즘을 실행하기 위해 필요한 실행시간과 필요로 하는 기억장치를 결정하는 것이다.<br/>
**테스트** : 디버깅, 성능분석

<br/>

## 좋은 알고리즘의 분석 기준

**정확성** : 적당한 입력에 대해서 유한 시간내에 올바른 답을 산출하는가를 판단.<br/>
**작업량** : 전체 알고리즘에서 수행되는 가장 중요한 연산들만으로 작업량을 측정해결하고자 하는 문제의 중요 연산이 여러개인<br/>
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 경우에는 각각의 중요 연산들의 합으로 간주하거나 중요 연산들에 가중치를 두어 계산<br/>
**기억 장소 사용량** : 수행에 필요한 저장 공간<br/>
**최적성** :그 알고리즘보다 더 적은 연산을 수행하는 알고리즘은 없는가? 최적이란 가장 '잘 알려진' 이 아니라 '가장 좋은'의<br/>
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 의미이다<br/>

<br/>

### 복잡도 : (점근 표기법 : Big-O Notation)
**O(1**) : 입력 자료의 수에 관계없이 일정한 실행 시간을 갖는 알고리즘<br/>
**O(log N)** : 입력 자료의 크기가 N일경우 log2N 번만큼의 수행시간을 가진다.<br/>
**O(N)** : 입력 자료의 크기가 N일경우 N 번만큼의 수행시간을 가진다.<br/>
**O(N log N)** : 입력 자료의 크기가 N일경우 N*(log2N) 번만큼의 수행시간을 가진다.<br/>
**O(N2)** : 입력 자료의 크기가 N일경우 N2 번만큼의 수행시간을 가진다.<br/>
**O(N3)** : 입력 자료의 크기가 N일경우 N3 번만큼의 수행시간을 가진다.<br/>
**O(2n)** : 입력 자료의 크기가 N일경우 2N 번만큼의 수행시간을 가진다.<br/>
**O(n!)** : 입력 자료의 크기가 N일경우 n*(n-1)*(n-2)... * 1(n!) 번만큼의 수행시간을 가진다. ex)외판원 문제(TSP)의 기본적인 해법<br/><br/>

출처:https://opentutorials.org/course/2471/13912

<br/>

## 공부법

유명한 온라인 알고리즘 사이트인, [BAEKJOON ONLINE JUDGE](https://www.acmicpc.net/) 와 [프로그래머스](https://programmers.co.kr/) <br/>
문제들을 단계별로 풀어보며 공부를 진행 할 것입니다.
