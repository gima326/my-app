# reagent 事始め

ClojureScript、shadow-cljs、react via reagent などなど。<br>

[reagent "0.10.0"] 以降、「reagent.core/render is deprecated」だそうです。<br>
参考にしたサイトのサンプルだけど、関数「reagent.dom/render」を使うように変更してやらないとエラー出まくりでした。<br>

### shadow-cljs のプロジェクト作成

```sh
$ npx create-cljs-project my-app
...
```

### browser repl の立ち上げ

```sh
$ pwd
~/my-app

$ npx shadow-cljs browser-repl
...
```

```clojure
cljs.user=> (+ 1 2)
3
```

### 簡単な clojuescript のコード作成と実行

"hello" は Build id で、[ shadow-cljs.edn ]に記載しているものと一致させるひつようがある。

```sh
$ npx shadow-cljs watch hello
...
```

### reagent を使う

```sh
$ pwd
~/my-app

$ npm install react react-dom create-react-class
my-app@0.0.1 ~/my-app
├─┬ create-react-class@15.7.0 
│ ├─┬ loose-envify@1.4.0 
│ │ └── js-tokens@4.0.0 
│ └── object-assign@4.1.1 
├── react@17.0.2 
└─┬ react-dom@17.0.2 
  └── scheduler@0.20.2 
```

"app" は Build id で、[ shadow-cljs.edn ]に記載しているものと一致させるひつようがある。

```sh
$ npx shadow-cljs watch app
...
```

## References

- 「[clojurescriptのshadow-cljsについて][1]」 [ `https://qiita.com/lambda-knight/items/a69df35405b26f7a79cf` ]<br>
- 「[Lesson 28: Using React via Reagent][2]」 [ `https://www.learn-clojurescript.com/section-5/lesson-28-using-react-via-reagent/` ]<br>

[1]: https://qiita.com/lambda-knight/items/a69df35405b26f7a79cf
[2]: https://www.learn-clojurescript.com/section-5/lesson-28-using-react-via-reagent/
