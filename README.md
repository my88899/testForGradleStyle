# TDD Kata in Java [![Build Status](https://travis-ci.org/WowCoach/tdd-kata-java.svg?branch=master)](https://travis-ci.org/WowCoach/tdd-kata-java)

### TDD Practice
* [TDD Practice 1 - 简单集合操作](docs/TDD1.md)
* [TDD Practice 2 - 猜数字游戏](docs/TDD2.md)

### Project Board
[Project Boards](https://github.com/WowCoach/tdd-kata-java#boards?repos=64041285)

### How to Start

#### Generate IntelliJ IDEA project
```
./gradlew cI idea  # Will clean idea first then idea
```

Open the `tdd-kata-java.ipr` using IntelliJ
```
open tdd-kata-java.ipr  # Using open or start depends on your OS
```

#### Run clean and build tasks
```
./gradlew # Will run default clean build tasks
```

This will also run checkstyle, unit test and code coverage check


### Git提交规范：

[卡号][提交作者&Pair作者] - comment here

Note: [提交作者]和comment之间需要有 空格+minus+空格，comment内容不要出现minus。

**Example:** `[M001][Shane&Water] - add the collection library`


### Java代码规范：

- Java代码必须删去没有引用到的包，Import语句为灰色即是可删去。
- 类文件开始处不要出现 "/* xxx create xxx */" 这样自动生成的注释。
- 还有其他规范Checkstyle将会覆盖到
