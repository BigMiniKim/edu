import http from "./http-common"

const getAll = () =>{
    return http.get("/rboard/list");
};

const remove = (id) =>{
    return http.delete(`/rboard/${id}`);
};

  


export default { 
    getAll,
    remove,
   
};
