from flask import Flask, request

app = Flask(__name__)


@app.route("/home")
def home() :
        a=10
        print(a)
        return "<h1>hello web</h1>"

home()
# 서버 구동
# flask 기본 포트 : 5000
app.run(port=5000, debug=True)

@app.route("/login")
def login() :
        # 념겨 받은 파라미터 출력
        # get 방식
        id = request.args.get("id")
        print("id : ",id)
        # POST 방식
        # id = request.args.from("id")

        return f'너의 아이디는{id}입니다'