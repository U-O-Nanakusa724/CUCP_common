# CUCP_common
CUCPの共通部分をまとめたプロジェクト

<details><summary>ディレクトリと役割</summary><div>

```dir
cucp_common
+ src/main
|  + java/biz/uoray/common
|  |   + constant    :プロジェクト共通の定数を定義したクラスなどを配置する
|  |   + entity      :データの受け皿クラスを格納する
|  |   + repository  
|  |   |  + custom   :自作リポジトリのインタフェースを定義する
|  |   |  + impl     :自作リポジトリの中身を実装する
|  |   + util        :プロジェクト共通の処理・メソッドを定義したクラスを配置する
|  |   + validation  :バリデーションアノテーションクラスを配置する
|  |      + validator:上記バリデーションのチェック処理を実装する
|  + resource        :様々なリソースを配置、詳細は割愛
+ build.gradle       :commonが依存するライブラリなどの定義を書く
+ setting.gradle     :

```

</div></details>
