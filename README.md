## GoF Design Pattern Types
### 생성패턴
  객체의 인스턴스생성과정을 추상화, 객체생성과 참조과정을 캡슐화   
  → 객체 생성/변경이 프로그램 구조에 영향을 받지 않도록함   
  → 프로그램 유연   
    - 생성 클래스 패턴 : 객체생성로직 일부를 서브클래스가 담당   
    - 생성 객체 패턴 : 객체생성을 다른 객체에게 위임   

### 행동패턴
  클래스나 객체들 간의 **상호작용방법** 또는 담당 로직 분류를 정의(어떤 알고리즘을 어떤 객체가 담당할지)   
  → 하나의 객체로 수행할 수 없는 작업을 쪼개서 분배, 결합도를 최소화한다.   
    - 행위 클래스 패턴 : 상속을 통해 알고리즘과 제어 흐름을 정의   
    - 행위 객체 패턴 : 하나의 작업을 수행하기 위해 객체 집합이 어떻게 협력하는지 정의   


### 구조패턴
  클래스나 객체들을 조합해 더 큰 구조로 만들 수 있게 해주는 패턴   
    - 구조 클래스 패턴 : 상속을 통해 클래스나 인터페이스를 합성   
    - 구조 객체 패턴 : 객체를 합성하는 방법을 정의   