#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Wed Feb 12 16:04:06 2020

@author: mobstaz_sc
"""

import pandas as pd
import datetime
import numpy as np
import json

#有如下列表：
#Index age	dpd
#1	23	16
#2	43	0
#3	43	0
#4	23	1
#5	45	15
#6	34	7
#…	…	…
#定义dpd>=10为逾期，请统计年龄分层分别为20-30，30-40，40-50的逾期率


##1.解题思路如下
df1 = pd.DataFrame([[1,23,16], [2,43,0], [3,43,0], [4,23,1], [5,45,15], [6,34,7]], columns = ['user_id', 'age', 'dpd'])
#添加一个年龄标签
def age_label(age):
    if (age>20 and age<30):
        return 1
    elif (age>=30 and age<40):
        return 2
    elif (age>=40 and age<50):
        return 3
    else:
        return 4;
        


df1["age_label"]=df1["age"].map(age_label)

#分组统计总人数，满足逾期条件的人数
result = df1.loc[df1["dpd"]>=10,'user_id'].groupby(df1["age_label"]).count()/df1['user_id'].groupby(df1["age_label"]).count()


print(result)




#现有DataFrame  A数据包含4个columns:
#userid，application_data:注册日期，dayno日期，app_usage某app每日使用次数统计， 
#‘日期’以及‘某app每日使用次数统计’的含义是，该人自注册日后至今天，每一天该app的使用情况的统计，
#我现在想统计每一个注册者注册完成后的7日内的微信使用总次数，该如何处理？ 
#Index	userid	application_date	app_usage	dayno
#1	1	2018/9/7	{wechat:5, weibo:4}	20180907
#2	1	2018/9/7	{wechat:2, weibo:5}	20180908
#3	2	2018/9/7	{wechat:1, baidu:6}	20180906
#4	3	2018/9/7	{wechat:7, zhihu:2}	20180905
#5	3	2018/9/7	{wechat:2, zhihu:1}	20180903
#6	3	2018/9/7	{wechat:6, weibo:6}	20180901
#…	…	…	…	…
raw = [[1, 20180907, {'wechat':5, 'weibo':4}, 20180907],
       [1, 20180907, {'wechat':2, 'weibo':5}, 20180908],
       [2, 20180907, {'wechat':1, 'baidu':6}, 20180906],
       [3, 20180907, {'wechat':7, 'zhihu':2}, 20180905],
       [3, 20180907, {'wechat':2, 'zhihu':1}, 20180903],
       [3, 20180907, {'wechat':6, 'weibo':6}, 20180918]]

df2 = pd.DataFrame(raw, columns = ['user_id', 'application_date', 'appusage', 'dayno'])


##2.解题思路如下
#新增加一列，给出userid 每天微信的使用次数
df2["wechat"]=df2["appusage"].map(lambda x:x['wechat'])
df2["sign_on"] = df2['application_date'].map(lambda x:datetime.datetime.strptime(str(x),'%Y%m%d'))
df2["date"] = df2['dayno'].map(lambda x:datetime.datetime.strptime(str(x),'%Y%m%d'))

#过滤dayno小于application_date+7 满足这个条件的所有userID记录
#是时间类型进行转换
result = df2.loc[df2['date']<df2['sign_on']+datetime.timedelta(days=7)]
res = result['wechat'].groupby(result['user_id']).sum()


#对用户userid进行分组统计微信使用次数
print(df2,result,res)
