import "./Sidebar.css";
import { NavLink } from "react-router-dom";

import {
  FaHome,
  FaUsers,
  FaUniversity,
  FaExchangeAlt,
  FaFileInvoiceDollar,
  FaIdCard,
  FaCog,
} from "react-icons/fa";

function Sidebar() {
  return (
    <div className="sidebar">
      <h3>Navigation</h3>

      <NavLink to="/" end>
        <FaHome /> Dashboard
      </NavLink>

      <NavLink to="/accounts">
        <FaUniversity /> Accounts
      </NavLink>

      <NavLink to="/customers">
        <FaUsers /> Customers
      </NavLink>

      <NavLink to="/transactions">
        <FaExchangeAlt /> Transactions
      </NavLink>

      <NavLink to="/loans">
        <FaFileInvoiceDollar /> Loans
      </NavLink>

      <NavLink to="/kyc">
        <FaIdCard /> KYC
      </NavLink>

      <NavLink to="/settings">
        <FaCog /> Settings
      </NavLink>
    </div>
  );
}

export default Sidebar;