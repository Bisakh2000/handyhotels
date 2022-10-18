import React, { useState } from 'react'

export default function AddHotel() {

    const [user,setUser] = useState({
        HotelName:"",
        location:"",
        phonenumber:""
    });

    const{HotelName,location,phonenumber} = user;

    const onInputChange = (e) => {
        setUser({...user, [e.target.name]: e.target.value});

    };


    const onSubmit = (e)=>{

    }




  return (
    <div className='container'>
        <div className='row'>
            <div className='col-md-6 offset-md-3 border rounded p-4 mt-2 shadow'>
                <h2 className='text-center m-4'>Add Hotel details </h2>
                <form></form>
                <div className='mb-3'>
                    <label htmlFor='HotelName' className='form-label'>
                        HotelName
                    </label>
                    <input type={"text"}
                    className="form-control"
                    placeholder='Enter Hotel Name'
                    name='HotelName'
                    value={HotelName}
                    onChange={(e) => onInputChange(e)}
                    />
                </div>

                <div className='mb-3'>
                    <label htmlFor='location' className='form-label'>
                        Location
                    </label>
                    <input type={"text"}
                    className="form-control"
                    placeholder='Enter Location Details'
                    name='location'
                    value={location}
                    onChange={(e) => onInputChange(e)}
                    />
                    
                </div>

                <div className='mb-3'>
                    <label htmlFor='phonenumber' className='form-label'>
                        Contact Details(Phone Number / Email-ID)
                    </label>
                    <input type={"text"}
                    className="form-control"
                    placeholder='Enter Contact Details'
                    name='phonenumber'
                    value={phonenumber}
                    onChange={(e) => onInputChange(e)}
                    />
                </div>

               <button type='submit' className='btn btn-outline-success'>Submit</button>
               <button type='submit' className='btn btn-outline-danger mx-2'>Cancel</button>




            </div>
        </div>
    </div>
  )
}
