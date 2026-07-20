import { useEffect, useState } from "react";
import { getAllCustomers } from "../../services/customerService";

function CustomerTable() {

    const [customers, setCustomers] = useState([]);

    useEffect(() => {
        loadCustomers();
    }, []);

    async function loadCustomers() {
        try {
            const data = await getAllCustomers();
            setCustomers(data);
        } catch (error) {
            console.error("Error loading customers:", error);
        }
    }

    return (
        <table>

            <thead>

                <tr>
                    <th>Customer ID</th>
                    <th>Name</th>
                    <th>Address</th>
                    <th>KYC Status</th>
                </tr>

            </thead>

            <tbody>

                {customers.map((customer) => (

                    <tr key={customer.custId}>

                        <td>{customer.custId}</td>

                        <td>{customer.name}</td>

                        <td>{customer.address}</td>

                        <td>{customer.kycStatus}</td>

                    </tr>

                ))}

            </tbody>

        </table>
    );
}

export default CustomerTable;