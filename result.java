import pandas

fails = pandas.read_excel("data.xlsx", sheet_name = "Sheet1")
lists = fails.values.tolist()
listsCount = len(lists)
i = 0
filtered_data = []
sex = input("Female or Male or All - ")
country = input("France, Great Britain. United States or All - ")
age = int(input("Age greater then 21-58 - "))

if sex == "All" and country == "All":
    for i in range(listsCount):
        if lists[i][5] > age:
            filtered_data.append(lists[i])

if sex == "Female" and country == "All":
    for i in range(listsCount):
        if lists[i][5] > age and lists[i][3] == "Female":
            filtered_data.append(lists[i])

if sex == "Male" and country == "All":
    for i in range(listsCount):
        if lists[i][5] > age and lists[i][3] == "Male":
            filtered_data.append(lists[i])

if sex == "Female" and country == "France":
    for i in range(listsCount):
        if lists[i][5] > age and lists[i][3] == "Female" and list[i][4] == "France":
            filtered_data.append(lists[i])

if sex == "Female" and country == "Great Britain":
    for i in range(listsCount):
        if lists[i][5] > age and lists[i][3] == "Female" and list[i][4] == "Great Britain":
            filtered_data.append(lists[i])
    
if sex == "Female" and country == "United States":
    for i in range(listsCount):
        if lists[i][5] > age and lists[i][3] == "Female" and list[i][4] == "United States":
            filtered_data.append(lists[i])

if sex == "Male" and country == "France":
    for i in range(listsCount):
        if lists[i][5] > age and lists[i][3] == "Male" and list[i][4] == "France":
            filtered_data.append(lists[i])

if sex == "Male" and country == "Great Britain":
    for i in range(listsCount):
        if lists[i][5] > age and lists[i][3] == "Male" and list[i][4] == "Great Britain":
            filtered_data.append(lists[i])
    
if sex == "Male" and country == "United States":
    for i in range(listsCount):
        if lists[i][5] > age and lists[i][3] == "Male" and list[i][4] == "United States":
            filtered_data.append(lists[i])

filtered_df = pandas.DataFrame(filtered_data, columns=fails.columns)
filtered_df.to_excel("filtered_data.xlsx", index = False)





