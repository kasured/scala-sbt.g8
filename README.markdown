A [Giter8][g8] template to set up a common layout for Scala/SBT project packed with Cats

#####
Prerequisites:
- JDK 8
- [sbt][sbt] 0.13.13 or higher ([download here][sbt_download])

##### The following components are present with their default versions unless specified otherwise
- Scala [2.11.12]
- SBT [0.13.17]
- ScalaTest [3.0.5]
- Scala Logging [3.9.0]
- Logback Classic [1.2.3]
- Cats Core [1.4.0]

Open a console and run the following command to apply this template:
 ```
sbt new kasured/scala-sbt.g8
 ```

SBT project will be created in the directory as per the name you provided 

To say hello to Cats cd to the directory and type ```sbt run```

From that directory you can also run ```sbt test``` to check if everything is fine with tests

Template license
----------------
Written in 2018 by Evgeny Rusak kasured@gmail.com

To the extent possible under law, the author(s) have dedicated all copyright and related
and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See <http://creativecommons.org/publicdomain/zero/1.0/>.

[g8]: http://www.foundweekends.org/giter8/
[sbt]: http://www.scala-sbt.org/
[sbt_download]: http://www.scala-sbt.org/download.html
