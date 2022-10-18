import React, { useEffect, useState } from 'react'
import axios from 'axios'

export default function Home() {

const[users, setUsers] = useState([])


useEffect(()=>{
    loadUsers();
},[]);

const loadUsers = async() => {
    const result = await axios.get("http://localhost:9090/hotels");
    setUsers(result.data);
};



  return (
    <div className='container'>
        <div className='py-4'>
        <table className='table table-striped border shadow'>
  <thead>
    <tr>
    
      <th scope="col">Index</th>
      <th scope='col'>Hotelid</th>
      <th scope="col">Hotelname</th>
      <th scope="col">Location</th>
      <th scope="col">Phonenumber</th>
      <th scope='col'>Actions</th>
    </tr>
  </thead>
  <tbody>
    {
        users.map((user,index)=>(
            <tr>
      <th scope="row" key={index}>{index+1}</th>
      
      <td>{user.hotel_id}</td>
      <td>{user.hotelname}</td>
      <td>{user.location}</td>
      <td>{user.phonenumber}</td>
      <td>
        <button className='btn btn-primary mx-2'>View</button>
        <button className='btn btn-outline-primary mx-2'>Edit</button>
        <button className='btn btn-danger mx-2'>Delete</button>
      </td>
    </tr>
        ))
    }
        
  </tbody>
</table>
        </div>

    </div>
  )
}
