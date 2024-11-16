def solution(id_pw, db):
    
    return "login" if [id_pw[0], id_pw[1]]in db else "wrong pw" if id_pw[0] in [db[i][0] for i in range(len(db))] else "fail" 
