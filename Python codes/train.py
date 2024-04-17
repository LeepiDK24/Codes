costS=2000.0
costTh=3000.0
costTw=4000.0
costA=5000.0
type=input("Enter type")
coach=input("Enter coach type")

if(type=="One Time Journey"):
    if(coach=="S"):
        print("The cost is ",costS)
    elif(coach=="3AC"):
        print("The cost is ",costTh)
    elif(coach=="2AC"):
        print("The cost is ",costTw)
    else:
        print("The cost is ",costA)

elif(type=="Monthly Pass"):
    if(coach=="S"):
        print("The cost is ",costS-0.2*(costS))
    elif(coach=="3AC"):
        print("The cost is ",costTh-0.2*(costTh))
    elif(coach=="2AC"):
        print("The cost is ",costTw-0.2*(costTw))
    else:
        print("The cost is ",costA-0.2*(costA))

