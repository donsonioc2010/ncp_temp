# Picasso

- [![Hits](https://hits.seeyoufarm.com/api/count/incr/badge.svg?url=https%3A%2F%2Fgithub.com%2Fdonsonioc2010%2Fpicasso&count_bg=%2379C83D&title_bg=%23555555&icon=&icon_color=%23E7E7E7&title=hits&edge_flat=false)](https://hits.seeyoufarm.com)
- [홈페이지 링크](http://picasso.jong1.com/)

---

## Index

- [Picasso](#picasso)
  - [Index](#index)
  - [주제](#주제)
  - [Git](#git)
    - [브랜치 전략](#브랜치-전략)
    - [Commit Convention](#commit-convention)
    - [Title](#title)
    - [Body](#body)
  - [TechStack](#techstack)
    - [FrontEnd](#frontend)
    - [BackEnd](#backend)
    - [Database](#database)
    - [Tool](#tool)
  - [Architecture](#architecture)
  - [ProtoType Wire Frame](#prototype-wire-frame)
  - [ERD](#erd)
    - [ERD Image](#erd-image)
  - [CI/CD](#cicd)
  - [회고](#회고)
    - [종원](#종원)
    - [세환](#세환)
  - [구현 기능](#구현-기능)
    - [마이페이지](#마이페이지)
    - [경매품 기능](#경매품-기능)
    - [결제](#결제)
    - [발송메일 알림 모습](#발송메일-알림-모습)
    - [스케쥴링](#스케쥴링)
      - [비동기전 동기화 상태의 코드 및 성능](#비동기전-동기화-상태의-코드-및-성능)
        - [시작 데이터 건수](#시작-데이터-건수)
        - [스케쥴링 시작시](#스케쥴링-시작시)
        - [스케쥴링 종료후](#스케쥴링-종료후)
      - [비동기로 변경 후 성능](#비동기로-변경-후-성능)
        - [실행 데이터 2000건](#실행-데이터-2000건)
        - [스케쥴링 시작 전](#스케쥴링-시작-전)

---

## 주제

> [!NOTE]  
> 미술품 경매 사이트

---

## Git

### 브랜치 전략

- `Git Flow`

### Commit Convention

| TagName | Description                               |
| :-----: | :---------------------------------------- |
|  feat   | 기능 개발 및 추가                         |
|   fix   | 버그 수정                                 |
|  docs   | 문서 수정                                 |
|  style  | 기능변경 없이 코드 스타일만 병경하는 경우 |
|  test   | Test코드 작성                             |
|  chore  | 빌드관련작업 전부                         |
| rename  | 파일명 수정                               |

### Title

- 큰 테마로 간단하게만 적도록 합니다.
- `Issue`가 존재하는 경우에는 `Issue Number`를 같이 링크하도록 합니다.

### Body

- `Title`에서 작성한 테마 기능, 또는 작업 내역에 대하여 `무슨 작업`을 `왜?`에 초점을 두어 작성한다.

---

## TechStack

### FrontEnd

![Thymeleaf](https://img.shields.io/badge/Bootstrap-v.5-7952B3?style=flat&logo=bootstrap&logoColor=white)
![HTML5](https://img.shields.io/badge/html-5-E34F26?style=flat&logo=html5&logoColor=white)
![CSS3](https://img.shields.io/badge/css-3-1572B6?style=flat&logo=css3&logoColor=white)
![JavaScript](https://img.shields.io/badge/JavaScript-E7DF1E?style=flat&logo=javascript&logoColor=white)
![Jquery](https://img.shields.io/badge/jQuery-v.3.7-0769AD?style=flat&logo=jquery&logoColor=white)

### BackEnd

![JDK17](https://img.shields.io/badge/Java-v.17-CC0000?style=flat&logo=OpenJDK&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-v.8-02303A?style=flat&logo=Gradle&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring-Boot_v.3-6DB33F?style=flat&logo=Spring-Boot&logoColor=white)
![Spring Data JPA](https://img.shields.io/badge/Spring-Data_JPA-6DB33F?style=flat&logo=Spring&logoColor=white)

### Database

![MySQL](https://img.shields.io/badge/MySQL-v.8.0.33-4479A1?style=flat&logo=MySQL&logoColor=white)
![H2](https://img.shields.io/badge/H2-v.2.1-4479A1?style=flat&logo=h2&logoColor=white)

### Tool

![Github](https://img.shields.io/badge/GitHub-181717?style=flat&logo=GitHub&logoColor=white)
![Github Actions](https://img.shields.io/badge/Github_Actions-2088FF?style=flat&logo=Github-Actions&logoColor=white)
![Intellij IDEA](https://img.shields.io/badge/IntelliJ-000000?style=flat&logo=IntelliJ-IDEA&logoColor=white)
![VSCode](https://img.shields.io/badge/VSCode-007ACC?style=flat&logo=Visual-Studio-Code&logoColor=white)

---

## Architecture

![Architecture Image](Docs/Architecture.png)

---

## ProtoType Wire Frame

> 초안으로 제작한 WireFrame 다들..그저 BackEnd였다...

![1](Docs/wireframe/1.png)
![2](Docs/wireframe/2.png)
![3](Docs/wireframe/3.png)
![4](Docs/wireframe/4.png)
![5](Docs/wireframe/5.png)
![6](Docs/wireframe/6.png)
![7](Docs/wireframe/7.png)
![8](Docs/wireframe/8.png)
![9](Docs/wireframe/9.png)

---

## ERD

> [!NOTE]
> DBDocs의 문서화 내용 변경하고싶은 경우  
> `./Docs/Picasso.dbml`의 파일 내용을 변경한 다음 `dev`브랜치에 Push가 진행될 경우 자동 갱신됩니다.

- [DBDocs 링크](https://dbdocs.io/donsonioc2010/Picasso)

### ERD Image

![ERD](Docs/erd.png)

---

## CI/CD

![Github Actions](https://img.shields.io/badge/Github_Actions-2088FF?style=flat&logo=Github-Actions&logoColor=white)

---

## 회고

### 종원

- [프로젝트 개요](https://devjong12.tistory.com/101)
- [와이어프레임](https://devjong12.tistory.com/102)
- [프로젝트의 CI / CD](https://devjong12.tistory.com/103)
- [NCloud ObjectStorage 업로드 공통기능 구현](https://devjong12.tistory.com/104)

### 세환

- [프로젝트 개요](https://dev-sh-bong.tistory.com/6)
- [CI와 CD, DBDocs의 CD구축](https://dev-sh-bong.tistory.com/7)

---

## 구현 기능

### 마이페이지

![마이페이지](Docs/Implementation/마이페이지%20수정방법.gif)

### 경매품 기능

![경매품 등록](Docs/Implementation/경매품등록.gif)
![등록된경매품확인](Docs/Implementation/등록된%20경매품의%20사용자%20확인.gif)
![승인및확인](Docs/Implementation/관리자%20승인%20후%20상태%20확인.gif)

### 결제

> 결제의 경우 실제 개발자 테스트계정이기 떄문에 로직 개발이 완료된 부분까지만 진행하였습니다.

![결제](Docs/Implementation/결제.gif)

### 발송메일 알림 모습

![메일](Docs/Implementation/발송%20메일.png)

### 스케쥴링

#### 비동기전 동기화 상태의 코드 및 성능

> 해당 로직에서 실제 많은 시간이 소요되는 것을 볼 수가 있다.

##### 시작 데이터 건수

![시작 데이터 건수](Docs/Implementation/스케쥴링/동기/동기%20테스트%20데이터%20100건.png)

##### 스케쥴링 시작시

![스케쥴링 시작](Docs/Implementation/스케쥴링/동기/동기%20스케쥴링%20시작시.png)

##### 스케쥴링 종료후

![스케쥴링 종료](Docs/Implementation/스케쥴링/동기/동기%20스케쥴링%20종료%20때.png)

#### 비동기로 변경 후 성능

> 0초...!

##### 실행 데이터 2000건

![시작 데이터](Docs/Implementation/스케쥴링/비동기/스케쥴링%20실해%20전%20데이터.png)

##### 스케쥴링 시작 전

> 실행과 동시에 데이터가 바뀌면서 종료되고 메일메소드 기능이 실행된다.

![스케쥴링 비동기 시작](Docs/Implementation/스케쥴링/비동기/스케쥴%20중%20메일서비스%20비동기%20실행%20로그.png)
![실행후 변경된 데이터](Docs/Implementation/스케쥴링/비동기/스케쥴링%20실행%20후.png)
