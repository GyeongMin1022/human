a = [1,1.2,"문자",True]
print(a)
print(a[1])

# print(a[10])  범위를 벗어나는 경우 오류발생

print(a[-2]) # 음수 인덱스는 뒤에서 부터 센다 맨마지막-1

a[3] = False
a[-1] = False

print('abcd'[0])  # 문자열도 배열로 취급한다
print(a[2][1])

# 초기화
a= []
a= list()

# range
# 시작인덳스, 종료인덱스, 스텝
# step 기본값 : 1
a = range(10) # 전달인자 하나인 경우 종료 index로 인식
