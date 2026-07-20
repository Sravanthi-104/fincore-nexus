import "./RecentActivity.css";
import {
  FaUserPlus,
  FaExchangeAlt,
  FaCheckCircle,
  FaMoneyBillWave
} from "react-icons/fa";

const activities = [
  {
    icon: <FaUserPlus />,
    title: "New Customer Registered",
    time: "5 mins ago"
  },
  {
    icon: <FaExchangeAlt />,
    title: "Money Transfer Completed",
    time: "15 mins ago"
  },
  {
    icon: <FaMoneyBillWave />,
    title: "Loan Approved",
    time: "1 hour ago"
  },
  {
    icon: <FaCheckCircle />,
    title: "KYC Verified",
    time: "2 hours ago"
  }
];

function RecentActivity() {
  return (
    <div className="activity-card">

      <h2>Recent Activity</h2>

      {activities.map((activity, index) => (
        <div className="activity-item" key={index}>

          <div className="activity-icon">
            {activity.icon}
          </div>

          <div>
            <h4>{activity.title}</h4>
            <p>{activity.time}</p>
          </div>

        </div>
      ))}

    </div>
  );
}

export default RecentActivity;